# korean-lunar-calendar-extension-kotlin
Kotlin extension functions for [korean-lunar-calendar](https://github.com/FrancescoJo/korean-lunar-calendar).

## Abstract 
Provides various Kotlin extension functions against 
[KoreanLunarDate](https://github.com/FrancescoJo/korean-lunar-calendar/blob/master/src/main/java/com/github/fj/koreanlunarcalendar/KoreanLunarDate.java)
for better code readibility.

In Java, for example, if you want to convert `KoreanLunarDate` to `java.util.Date`, the code would be like:

    import com.github.fj.koreanlunarcalendar.KoreanLunarCalendarUtils;

    final Date gregorianDate = KoreanLunarCalendarUtils.toGregorianDate(lunarDate);

which functions correctly but seems unnatural as compare to human expression. In Kotlin, however:

    import com.github.fj.koreanlunarcalendar.asGregorianDate

    val gregorianDate = lunarDate.asGregorianDate()

is possible thanks for extension function feature.

## Compatibility
Java 1.6+, all Android versions

## Download
You must install [jitpack.io](https://jitpack.io/) plugin to your build script in order to import this project.

### Gradle

    dependencies {
        implementation "com.github.FrancescoJo:korean-lunar-calendar-ktext:1.0"
    }

### Maven

    <dependency>
        <groupId>com.github.FrancescoJo</groupId>
        <artifactId>korean-lunar-calendar-ktext</artifactId>
        <version>1.0</version>
    </dependency>

## Usage
See [KoreanLunarCalendar](https://github.com/FrancescoJo/korean-lunar-calendar) documentation.

## License
This code is under the [Apache Licence v2](https://www.apache.org/licenses/LICENSE-2.0).
