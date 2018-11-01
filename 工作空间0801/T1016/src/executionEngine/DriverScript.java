package executionEngine;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import config.ActionsKeywords;
import utility.ExcelUtils;
 
 
/**
 * create by qiu on 2018/10/25
 */
public class DriverScript {
 
    public static void main(String[] args) throws Exception {
        String excel_path = "D:\\工作空间0801\\T1016\\src\\dataEngine\\dataEngine.xlsx";
        // 加载读取excel文件
        FileInputStream fis = new FileInputStream(excel_path);
        @SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//加载sheet，这里我们只有一个sheet,默认是sheet1
        
		XSSFSheet sh1= wb.getSheetAt(0);
        for (int iRow=1;iRow<=10;iRow++){
            String sActionKeyword =sh1.getRow(iRow).getCell(3).getStringCellValue(); 
            System.out.println(iRow); 
            System.out.println(sActionKeyword);
            // 和excel文件中关键字进行对比
            if(sActionKeyword.equals("openBrowser")){
                // 如果Excel文件中存在openBrowser的关键字就会调用openBrowser()方法， 进行相关操作；下面其他关键字同理。
                ActionsKeywords.openBrowser();
            } else if(sActionKeyword.equals("openUrl")){
                ActionsKeywords.openUrl();
            } else if(sActionKeyword.equals("click_Login_link")){
                ActionsKeywords.click_Login_link();
            } else if(sActionKeyword.equals("input_Username")){
                ActionsKeywords.input_Username();
            } else if(sActionKeyword.equals("input_Password")){
                ActionsKeywords.input_Password();
            } else if(sActionKeyword.equals("click_Submit")){
                ActionsKeywords.click_Submit();
            } else if(sActionKeyword.equals("closeBrowser")){
                ActionsKeywords.closeBrowser();
            }
 
        }
 
    }
}

