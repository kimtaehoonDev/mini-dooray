package com.kimtaehoonki.account.presentation.dto;

import com.kimtaehoonki.account.domain.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberRegisterRequestDto {
    private String username;
    private String name;
    private String email;
    private String phoneNum;
    private String password;

    public Member makeMember() {
        return new Member(null,
            this.getUsername(), this.getName(), this.getEmail(),
            this.getPhoneNum(), this.getPassword());
    }
}
