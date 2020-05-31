package ru.itis.amvbox.micro.signupservice.service;

import ru.itis.amvbox.micro.signupservice.dto.SignUpForm;
import ru.itis.amvbox.micro.signupservice.dto.SignUpResultDTO;

public interface SignUpService {
    SignUpResultDTO signUp(SignUpForm form);
}