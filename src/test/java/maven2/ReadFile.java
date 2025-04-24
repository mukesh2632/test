package maven2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        // Define the file path for the Excel file
        File f = new File("C:\\Users\\Mukesh\\eclipse-workspace\\sel\\maven2\\target\\Mukeshexcel.xlsx");

        // Create a FileOutputStream to write to the file
        FileOutputStream f1 = new FileOutputStream(f);

        // Create a new workbook and a sheet within it
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("batch1");

        // Create the first row (row 0) and place "hari" in the 2nd column (column 1)
        XSSFRow row1 = sheet.createRow(1); // 1st row (row 0)
        XSSFCell cell1 = row1.createCell(1); // 2nd column (column 1)
        cell1.setCellValue("hari");

        // Create the 4th row (row 3) and place "authun" in the 5th column (column 4)
        XSSFRow row4 = sheet.createRow(3); // 4th row (row 3)
        XSSFCell cell4 = row4.createCell(4); // 5th column (column 4)
        cell4.setCellValue("authun");

        // Create the 5th row (row 4) and place "dheepak" in the 2nd and 3rd columns (columns 1 and 2)
        XSSFRow row5 = sheet.createRow(4); // 5th row (row 4)
        
        XSSFCell cell5_2 = row5.createCell(2); // 3rd column (column 2)
      
        cell5_2.setCellValue("dheepak");

        // Write the workbook to the file
        workbook.write(f1);

        // Close the FileOutputStream and workbook to save the file
        f1.close();
        workbook.close();

        // Output message indicating successful creation
     
    }
}







