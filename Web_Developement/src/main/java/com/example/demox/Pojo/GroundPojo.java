package com.example.demox.Pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.* ;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor


public class GroundPojo {
    private Integer id;

//    @NotNull(message="Ground name is required field")
    private String groundName ;
}
