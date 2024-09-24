package ThucHanh20241;
import java.util.Scanner;
public class PhuongTrinhBacNhatLtHoa {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// Khởi tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
				Scanner sc = new Scanner(System.in);
				//Nhập giá trị a và b
				System.out.print("Nhập giá trị a: ");
				double ahoalt= sc.nextDouble();
				System.out.print("Nhập giá trị b: ");
				double bhoalt= sc.nextDouble();
				//Giải phương trình bậc nhất ax+b=0;
				if (ahoalt!=0)
					System.out.print("PT co nghiem x= "+-bhoalt/ahoalt);
				else if(bhoalt !=0) System.out.print("PT vo nghiem ");
					else System.out.print("PT vo so nghiem ");
				// Đóng Scanner
				sc.close();

	}

}
