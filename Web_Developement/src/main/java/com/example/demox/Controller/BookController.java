package com.example.demox.Controller;

import com.example.demox.Pojo.BookPojo;
import com.example.demox.entity.Book;
import com.example.demox.projection.BookProjection;
import com.example.demox.service.BookService;
import com.example.demox.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.codec.ServerSentEvent.builder;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

//    @PostMapping
//    public void saveBook(@RequestBody BookPojo bookPojo) {
//        bookService.saveData(bookPojo);
//    }
//
//    @GetMapping
//    public List <Book> getAllBooks(){
//        return bookService.findAll() ;
//    }

    @GetMapping
    public GlobalApiResponse<List<BookProjection>> getData(BookProjection bookProjection) {
        return GlobalApiResponse.
                <List<BookProjection>>builder()
                .data(this.bookService.findAll())
                .statusCode(200)
                .message("data retreived successfully")
                .build();
    }

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody BookPojo bookPojo) {
        this.bookService.saveData(bookPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }
    @PutMapping
    public GlobalApiResponse<Book> update(@RequestBody BookPojo bookPojo){
        Book updateBook  = this.bookService.saveData(bookPojo);
        return  GlobalApiResponse.<Book>builder()
                .data(updateBook)
                .statusCode(200)
                .message("Data has been updated succefully")
                .build() ;
    }

    @DeleteMapping("/delete")
    public GlobalApiResponse<String> deleteBook(@RequestBody BookPojo bookPojo) {
        this.bookService.deleteAll(bookPojo);
        return GlobalApiResponse.<String>builder()
                .data("Book with groundId " + bookPojo.getGroundId() + ", bookName " + bookPojo.getBookName() + ", and userId " + bookPojo.getUserId() + " deleted successfully")
                .statusCode(200)
                .message("Data deleted successfully")
                .build();
    }




}
