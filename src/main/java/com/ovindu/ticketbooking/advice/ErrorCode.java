package com.ovindu.ticketbooking.advice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorCode {
    private String errorMessage;
}
