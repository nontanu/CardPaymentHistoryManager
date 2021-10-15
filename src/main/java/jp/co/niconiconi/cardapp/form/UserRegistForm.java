package jp.co.niconiconi.cardapp.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistForm {
    @NotBlank
    @Size(min = 1, max = 127)
    private String userName;

    @NotBlank
    @Size(min = 1, max = 127)
    private String password;
}
