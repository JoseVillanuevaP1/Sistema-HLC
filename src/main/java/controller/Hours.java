package controller;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hours implements Serializable {

    private String titulo;
    private String message;
    private int hour;
    private int minute;
    private static final long serialVersionUID = 1L;

}
