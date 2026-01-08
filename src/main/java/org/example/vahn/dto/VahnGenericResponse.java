package org.example.vahn.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VahnGenericResponse<T> {
    private boolean success;
    private int status;
    private String message;
    private T data;
    private Object error;

    public static <T> VahnGenericResponse<T> ok(T data) {
        return VahnGenericResponse.<T>builder()
                .success(true)
                .status(HttpStatus.OK.value())
                .message("Success")
                .data(data)
                .build();
    }

    public static <T> VahnGenericResponse<T> ok(T data, HttpStatus status) {
        return VahnGenericResponse.<T>builder()
                .success(true)
                .status(status.value())
                .message("Success")
                .data(data)
                .build();
    }

    public static <T> VahnGenericResponse<T> fail(HttpStatus status, String message, Object errorDetails) {
        return VahnGenericResponse.<T>builder()
                .success(false)
                .status(status.value())
                .message(message)
                .error(errorDetails)
                .build();
    }
}
