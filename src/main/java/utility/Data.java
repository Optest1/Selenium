package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public String path = null;
	public static String fileroot = System.getProperty("user.dir") + "\\Data\\";
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	private static Object[][] login = null;

	public Data(String filepath) {

		this.path = fileroot + filepath;
		// System.out.println(path);
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}

	public Object[][] credentials(String sheetname) {
		sheet = workbook.getSheet(sheetname);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		login = new Object[rows][cols];

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
				row = sheet.getRow(i);
				cell = row.getCell(j);
				if (cell.getCellType() == CellType.STRING) {
					login[i - 1][j] = cell.getStringCellValue();
				}

				else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
					login[i - 1][j] = (int) cell.getNumericCellValue();
				}
			}

		}
		return login;
	}

}
