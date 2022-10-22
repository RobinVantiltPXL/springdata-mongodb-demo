package be.pxl.springdatamongodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pokemon implements Serializable {
    private String id;
    private String name;
    private List<Move> moves;
    private List<String> stringList;
}
