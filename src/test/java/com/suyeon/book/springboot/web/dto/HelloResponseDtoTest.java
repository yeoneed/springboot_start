package com.suyeon.book.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat; //검증하고 싶은 대상을 메소드 인자로 받음

class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() throws Exception {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}