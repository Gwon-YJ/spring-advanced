package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    // Validation 이용
    @NotBlank(message = "기존 비밀번호는 필수입니다.")
    private String oldPassword;

    @NotBlank(message = "새 비밀번호는 필수입니다.")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$",
            message = "새 비밀번호는 8자 이상이어야 하며, 숫자와 대문자를 포함해야 합니다."
    )
    private String newPassword;
}

