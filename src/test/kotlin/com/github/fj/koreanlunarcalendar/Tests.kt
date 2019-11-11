/*
 * Copyright 2019 Francesco Jo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.fj.koreanlunarcalendar

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

/**
 * @since 08 - Jan - 2019
 */
class Tests {
    @Test
    fun `asGregorianDate produces expected output`() {
        // given:
        val expected = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul")).apply {
            clear()
            set(2019, Calendar.JANUARY, 8)
        }.time

        // when:
        val actual = KoreanLunarCalendarUtils.getLunarDateOf(2019, 1, 8)
            .asGregorianDate()

        // expect:
        assertEquals(expected, actual)
    }

    @Test
    fun `year stem, branch, cycle characters are exact`() {
        // given:
        val date = KoreanLunarCalendarUtils.getLunarDateOf(2019, 1, 8)

        // expect:
        assertEquals('戊', date.getHeavenlyStemYearChinese())
        assertEquals('무', date.getHeavenlyStemYearKorean())
        assertEquals('戌', date.getEarthlyBranchYearChinese())
        assertEquals('술', date.getEarthlyBranchYearKorean())
        assertEquals("戊戌", date.getSexagenaryCycleYearChinese())
        assertEquals("무술", date.getSexagenaryCycleYearKorean())
    }

    @Test
    fun `month stem, branch, cycle characters are exact`() {
        // given:
        val date = KoreanLunarCalendarUtils.getLunarDateOf(2019, 1, 8)

        // expect:
        assertEquals('乙', date.getHeavenlyStemMonthChinese())
        assertEquals('을', date.getHeavenlyStemMonthKorean())
        assertEquals('丑', date.getEarthlyBranchMonthChinese())
        assertEquals('축', date.getEarthlyBranchMonthKorean())
        assertEquals("乙丑", date.getSexagenaryCycleMonthChinese())
        assertEquals("을축", date.getSexagenaryCycleMonthKorean())
    }


    @Test
    fun `day stem, branch, cycle characters are exact`() {
        // given:
        val date = KoreanLunarCalendarUtils.getLunarDateOf(2019, 1, 8)

        // expect:
        assertEquals('乙', date.getHeavenlyStemDayChinese())
        assertEquals('을', date.getHeavenlyStemDayKorean())
        assertEquals('巳', date.getEarthlyBranchDayChinese())
        assertEquals('사', date.getEarthlyBranchDayKorean())
        assertEquals("乙巳", date.getSexagenaryCycleDayChinese())
        assertEquals("을사", date.getSexagenaryCycleDayKorean())
    }
}
