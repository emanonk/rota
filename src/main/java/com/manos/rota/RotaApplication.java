package com.manos.rota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RotaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RotaApplication.class, args);


		//@Value( "${jdbc.url:aDefaultUrl}" )

		///ApplicationContext context = SpringApplication.run(Application.class, args);
		//HelloSpring bean = context.getBean(HelloSpring.class);
		//bean.printHello();

		/*
		File myFile = new File("C://temp/Employee.xlsx"); FileInputStream fis = new FileInputStream(myFile); // Finds the workbook instance for XLSX file XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); // Return first sheet from the XLSX workbook XSSFSheet mySheet = myWorkBook.getSheetAt(0); // Get iterator to all the rows in current sheet Iterator<Row> rowIterator = mySheet.iterator(); // Traversing over each row of XLSX file while (rowIterator.hasNext()) { Row row = rowIterator.next(); // For each row, iterate through each columns Iterator<Cell> cellIterator = row.cellIterator(); while (cellIterator.hasNext()) { Cell cell = cellIterator.next(); switch (cell.getCellType()) { case Cell.CELL_TYPE_STRING: System.out.print(cell.getStringCellValue() + "\t"); break; case Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue() + "\t"); break; case Cell.CELL_TYPE_BOOLEAN: System.out.print(cell.getBooleanCellValue() + "\t"); break; default : } } System.out.println(""); }

Read more: http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html#ixzz5JoYmVuwG




//////

public class XLSXReaderWriter { public static void main(String[] args) { try { File excel = new File("C://temp/Employee.xlsx"); FileInputStream fis = new FileInputStream(excel); XSSFWorkbook book = new XSSFWorkbook(fis); XSSFSheet sheet = book.getSheetAt(0); Iterator<Row> itr = sheet.iterator(); // Iterating over Excel file in Java while (itr.hasNext()) { Row row = itr.next(); // Iterating over each column of Excel file Iterator<Cell> cellIterator = row.cellIterator(); while (cellIterator.hasNext()) { Cell cell = cellIterator.next(); switch (cell.getCellType()) { case Cell.CELL_TYPE_STRING: System.out.print(cell.getStringCellValue() + "\t"); break; case Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue() + "\t"); break; case Cell.CELL_TYPE_BOOLEAN: System.out.print(cell.getBooleanCellValue() + "\t"); break; default: } } System.out.println(""); } // writing data into XLSX file Map<String, Object[]> newData = new HashMap<String, Object[]>(); newData.put("7", new Object[] { 7d, "Sonya", "75K", "SALES", "Rupert" }); newData.put("8", new Object[] { 8d, "Kris", "85K", "SALES", "Rupert" }); newData.put("9", new Object[] { 9d, "Dave", "90K", "SALES", "Rupert" }); Set<String> newRows = newData.keySet(); int rownum = sheet.getLastRowNum(); for (String key : newRows) { Row row = sheet.createRow(rownum++); Object[] objArr = newData.get(key); int cellnum = 0; for (Object obj : objArr) { Cell cell = row.createCell(cellnum++); if (obj instanceof String) { cell.setCellValue((String) obj); } else if (obj instanceof Boolean) { cell.setCellValue((Boolean) obj); } else if (obj instanceof Date) { cell.setCellValue((Date) obj); } else if (obj instanceof Double) { cell.setCellValue((Double) obj); } } } // open an OutputStream to save written data into Excel file FileOutputStream os = new FileOutputStream(excel); book.write(os); System.out.println("Writing on Excel file Finished ..."); // Close workbook, OutputStream and Excel file to prevent leak os.close(); book.close(); fis.close(); } catch (FileNotFoundException fe) { fe.printStackTrace(); } catch (IOException ie) { ie.printStackTrace(); } } }

Read more: http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html#ixzz5JoYwnBGb
		 */
	}
}
