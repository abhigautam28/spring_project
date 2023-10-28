package com.topics.utils;


import com.topics.allTopics.Topics;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtil {

    public static String Header[] = {"id", "course", "description"};
    public static String sheetName = "ALL Topics";

    public ByteArrayInputStream dataToExcel(List<Topics> allTopic) throws IOException {
      // import workbook interface from apache poi
        Workbook workbook = new XSSFWorkbook();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // create sheet
        try {

            Sheet sheet = workbook.createSheet(sheetName);

            //now add header to first row of the sheet
            Row row = sheet.createRow(0);
            //create cell in the row
            for (int i = 0; i < Header.length; i++) {
                row.createCell(i).setCellValue(Header[i]);
            }

            //now for every attribute we need to add value
            int rowCount = 1;
            allTopic.forEach(topic -> {
                Row row1 = sheet.createRow(rowCount);
                row1.createCell(0).setCellValue(topic.getId());
                row1.createCell(1).setCellValue(topic.getCourse());
                row1.createCell(2).setCellValue(topic.getDescription());
//                rowCount++;
            });

            workbook.write(byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } finally {
            workbook.close();
            byteArrayOutputStream.close();
        }

    }
}
