package com.pk.payloads;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter
@Setter
public class UserDto {
	@Id
private int id;
	@NotEmpty
	@Size(min=4,message="Username must be min 4 character")
private String name;
	@Email(message="Email address is not valid!!!")
private String email;
	
	@NotEmpty
	@Size(min=3,max=10,message="Password must be minimum of 3 chars and maximum of 10 chars")
private String password;
	
	@NotNull
private String about;
}
