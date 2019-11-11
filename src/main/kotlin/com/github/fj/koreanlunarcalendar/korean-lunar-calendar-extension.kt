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

import java.util.Date

/*
 * Collections of extension functions to express intentions related to KoreanLunarDate more naturally, in Kotlin.
 * No intervention of KoreanLunarCalendarUtils among various conversions.
 */

fun KoreanLunarDate.asGregorianDate(): Date =
    KoreanLunarCalendarUtils.toGregorianDate(this)

// region Heavenly stem conversion functions
fun KoreanLunarDate.getHeavenlyStemYearChinese(): Char =
    KoreanLunarCalendarUtils.getHeavenlyStemChinese(this.yearlyCycle)

fun KoreanLunarDate.getHeavenlyStemYearKorean(): Char =
    KoreanLunarCalendarUtils.getHeavenlyStemKorean(this.yearlyCycle)

fun KoreanLunarDate.getHeavenlyStemMonthChinese(): Char =
    KoreanLunarCalendarUtils.getHeavenlyStemChinese(this.monthlyCycle)

fun KoreanLunarDate.getHeavenlyStemMonthKorean(): Char =
    KoreanLunarCalendarUtils.getHeavenlyStemKorean(this.monthlyCycle)

fun KoreanLunarDate.getHeavenlyStemDayChinese(): Char =
    KoreanLunarCalendarUtils.getHeavenlyStemChinese(this.dailyCycle)

fun KoreanLunarDate.getHeavenlyStemDayKorean(): Char =
    KoreanLunarCalendarUtils.getHeavenlyStemKorean(this.dailyCycle)
// endregion

// region Earthly branch conversion functions
fun KoreanLunarDate.getEarthlyBranchYearChinese(): Char =
    KoreanLunarCalendarUtils.getEarthlyBranchChinese(this.yearlyCycle)

fun KoreanLunarDate.getEarthlyBranchYearKorean(): Char =
    KoreanLunarCalendarUtils.getEarthlyBranchKorean(this.yearlyCycle)

fun KoreanLunarDate.getEarthlyBranchMonthChinese(): Char =
    KoreanLunarCalendarUtils.getEarthlyBranchChinese(this.monthlyCycle)

fun KoreanLunarDate.getEarthlyBranchMonthKorean(): Char =
    KoreanLunarCalendarUtils.getEarthlyBranchKorean(this.monthlyCycle)

fun KoreanLunarDate.getEarthlyBranchDayChinese(): Char =
    KoreanLunarCalendarUtils.getEarthlyBranchChinese(this.dailyCycle)

fun KoreanLunarDate.getEarthlyBranchDayKorean(): Char =
    KoreanLunarCalendarUtils.getEarthlyBranchKorean(this.dailyCycle)
// endregion

// region Sexagenary cycle conversion functions
fun KoreanLunarDate.getSexagenaryCycleYearChinese(): String =
    KoreanLunarCalendarUtils.getSexagenaryCycleChinese(this.yearlyCycle)

fun KoreanLunarDate.getSexagenaryCycleYearKorean(): String =
    KoreanLunarCalendarUtils.getSexagenaryCycleKorean(this.yearlyCycle)

fun KoreanLunarDate.getSexagenaryCycleMonthChinese(): String =
    KoreanLunarCalendarUtils.getSexagenaryCycleChinese(this.monthlyCycle)

fun KoreanLunarDate.getSexagenaryCycleMonthKorean(): String =
    KoreanLunarCalendarUtils.getSexagenaryCycleKorean(this.monthlyCycle)

fun KoreanLunarDate.getSexagenaryCycleDayChinese(): String =
    KoreanLunarCalendarUtils.getSexagenaryCycleChinese(this.dailyCycle)

fun KoreanLunarDate.getSexagenaryCycleDayKorean(): String =
    KoreanLunarCalendarUtils.getSexagenaryCycleKorean(this.dailyCycle)
// endregion
