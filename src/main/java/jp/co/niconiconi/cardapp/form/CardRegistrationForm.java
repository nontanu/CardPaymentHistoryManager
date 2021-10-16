package jp.co.niconiconi.cardapp.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardRegistrationForm {
    @Size(min = 1, max = 32)
    private String name;
    @NotBlank
    @Size(min = 1, max = 64)
    private String company;
    @NotBlank
    @Size(min = 1, max = 12)
    private String brand;
}
