package com.example.demox.Controller;

import com.example.demox.Pojo.RolePojo;
import com.example.demox.entity.Role;
import com.example.demox.service.RoleService;
import com.example.demox.shared.pojo.GlobalApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/role")
@AllArgsConstructor

public class RoleController {

private final RoleService roleService;


    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody RolePojo rolePojo) {
        this.roleService.saveData(rolePojo) ;
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }

   @GetMapping
    public GlobalApiResponse<List<Role>> getData() {
       return GlobalApiResponse.
               <List<Role>>builder()
               .data(this.roleService.findAll())
               .statusCode(200)
               .message("Data retreived successfully")
               .build();

   }

  @PutMapping
    public GlobalApiResponse<Role> update(@RequestBody RolePojo rolePojo) {
        Role updateRole = this.roleService.saveData(rolePojo);
        return GlobalApiResponse.<Role>builder().
                data(updateRole)
                .statusCode(200)
                .message("Data has been successfully updated")
                .build();
  }
  @DeleteMapping("delete/{id}")
    public GlobalApiResponse<String> delete(@PathVariable int id) {
        this.roleService.deleteById(id);
        return GlobalApiResponse.<String>builder().
                data("Role with id "+ id+"has been deleted successfully")
                .statusCode(200)
                .message("Data deleted succesfully")
                .build();
  }

}
