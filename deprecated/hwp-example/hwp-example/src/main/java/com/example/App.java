// package com.example;

// import java.io.File;
// import java.io.FileWriter;

// import kr.dogfoot.hwplib.reader.HWPReader;
// import kr.dogfoot.hwplib.object.HWPFile;
// import kr.dogfoot.hwplib.tool.textextractor.TextExtractMethod;
// import kr.dogfoot.hwplib.tool.textextractor.TextExtractor;

// public class App {
//     public static void main(String[] args) {
//         try {
//             String filePath = "sample.hwp";
//             HWPFile hwpFile = HWPReader.fromFile(filePath);
//             String text = TextExtractor.extract(hwpFile, TextExtractMethod.InsertControlTextBetweenParagraphText);
//             System.out.println("==== HWP 파일 내용 ====");
//             System.out.println(text);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


// text 파일 저장용 추가
package com.example;

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

import kr.dogfoot.hwplib.reader.HWPReader;
import kr.dogfoot.hwplib.object.HWPFile;
import kr.dogfoot.hwplib.tool.textextractor.TextExtractMethod;
import kr.dogfoot.hwplib.tool.textextractor.TextExtractor;

public class App {
    public static void main(String[] args) {
        try {
            String filePath = "sample.hwp";
            HWPFile hwpFile = HWPReader.fromFile(filePath);
            String text = TextExtractor.extract(hwpFile, TextExtractMethod.InsertControlTextBetweenParagraphText);

            System.out.println("==== HWP 파일 내용 ====");
            System.out.println(text);

            // UTF-8로 저장
            try (OutputStreamWriter writer = new OutputStreamWriter(
                    new FileOutputStream("output.txt"), StandardCharsets.UTF_8)) {
                writer.write(text);
            }

            System.out.println("✅ output.txt에 UTF-8로 저장 완료!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
