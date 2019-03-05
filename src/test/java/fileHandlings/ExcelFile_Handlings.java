package fileHandlings;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelFile_Handlings {
    public static void main(String[] args) throws Exception {

        FileInputStream excel = new FileInputStream("Testing1.xlsx"); //read file
        XSSFWorkbook testing1 = new XSSFWorkbook(excel); //recognize file as excel file

        XSSFSheet Kuddus = testing1.getSheet("Kuddus");
        String aa = Kuddus.getRow(1).getCell(1).getStringCellValue();
        //System.out.println(aa);

        int rownumber = Kuddus.getLastRowNum();
        System.out.println(rownumber);
        int cellNumber = Kuddus.getRow(0).getLastCellNum();

        for(int x=0; x<=rownumber; x++){
            for(int y=0; y<Kuddus.getRow(x).getLastCellNum(); y++){
                String BB = Kuddus.getRow(x).getCell(y).getStringCellValue();
                System.out.println(BB);
            }
        }

    }







}
