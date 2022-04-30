package Shape;

public class Quadrilateral extends Point{
    private Point d1;
    private Point d2;
    private Point d3;
    private Point d4;

    public Quadrilateral()
    {
        d1 = new Point();
        d2 = new Point();
        d3 = new Point();
        d4 = new Point();
    }

    public void InQuadrilateral()
    {
        System.out.println("Đỉnh số 1: ");
        d1.InPoin();
        System.out.println("Đỉnh số 2: ");
        d2.InPoin();
        System.out.println("Đỉnh số 3: ");
        d3.InPoin();
        System.out.println("Đỉnh số 4: ");
        d4.InPoin();
    }

    public void OutQuadrilateral()
    {
        System.out.print("Tọa độ 4 đỉnh là: \n");
        d1.OutPoint();
        d2.OutPoint();
        d3.OutPoint();
        d4.OutPoint();
        if(LoaiTuGiac()==0)
            System.out.print("4 điểm không tạo thành tứ giác.");
        else if(LoaiTuGiac()==1)
            System.out.print("4 điểm tạo thành tứ giác lõm.");
        else if(LoaiTuGiac()==2)
            System.out.print("4 điểm tạo thành tứ giác lồi.");
        else if(LoaiTuGiac()==3)
            System.out.print("4 điểm tạo thành hình chữ nhật.");
        else if(LoaiTuGiac()==4)
            System.out.print("4 điểm tạo thành hình vuông.");
        else if(LoaiTuGiac()==5)
            System.out.print("4 điểm tạo thành hình bình hành.");
        else if(LoaiTuGiac()==6)
            System.out.print("4 điểm tạo thành hình thoi.");
        else if(LoaiTuGiac()==7)
            System.out.print("4 điểm tạo thành hình thang.");
        else if(LoaiTuGiac()==8)
            System.out.print("4 điểm tạo thành hình thang vuông.");
    }
    
    private int LoaiTuGiac()
    {
        if(xet3diem(d1, d2, d3)==false || xet3diem(d1, d2, d4)==false || xet3diem(d1, d3, d4)==false || xet3diem(d2, d3, d4)==false)
        {//Không có 3 điểm nào cùng nằm trên 1 đường thẳng -> tứ giác
            if(Loi_Lom() == true)//Tứ giác lồi
            {
                // demss và demvuong là đếm các cặp cạnh không xuất phát từ 1 điểm có vuông hay ss hay không
                // nếu demvuong = 1 thì sẽ có 2 đường chéo vuông góc với nhau --> hình vuông hoặc hình thoi
                int demss=0;
                //4 điểm tạo thành 6 cạnh nên có 3 cặp cạnh không xuất phát từ 1 điểm
                //Cặp 1
                if(ktcapcanh(d1, d2, d3, d4) == 2)
                        demss++;
                //Cặp 2
                if(ktcapcanh(d1, d3, d2, d4) == 2)
                        demss++;
                //Cặp 3
                if(ktcapcanh(d1, d4, d2, d3) == 2)
                        demss++;
                
                if(demss == 1)//1 cặp cạnh // -> Hình thang
                {
                    if(sogocvuong(d1, d2, d3, d4)==2)
                        return 8;//Hình Thang vuông
                    else
                        return 7;//Hình thang thường
                }
                else if(demss == 2 && sogocvuong(d1, d2, d3, d4) == 0)
                {
                    if(Canh_Ke_Nhau()==true)//xét độ dài 2 cạnh kề nhau nếu bằng nhau là hình thoi
                        return 6;//hình thoi
                    else 
                        return 5;//hình bình hành
                }
                else if (demss == 2 && sogocvuong(d1, d2, d3, d4) == 4) {
                    if (Canh_Ke_Nhau()==true)
                        return 4;//Hình Vuông
                    else
                        return 3;//hình chữ nhật
                }
                else
                    return 2;//Hình tứ giác lồi 
            }
            else
                return 1;//Tứ giác lõm
        }
        else
            return 0;//3 điểm nằm trên 1 đường thẳng -> không phải tứ giác
    }

    private boolean xet3diem(Point a,Point b,Point c)//Xét 3 điểm có nằm trên đường thẳng không
    {
        float x1 = a.getX();
        float y1 = a.getY();
        float x2 = b.getX();
        float y2 = b.getY();
        float x3 = c.getX();
        float y3 = c.getY();
        float m = (y2 - y1) / (x2 - x1);
        float n = (y3 - y2) / (x3 - x2);

        if(m == n )
            return true;//3 điểm nằm trên 1 đường thẳng
        else
            return false;//3 điểm không nằm trên 1 đường thẳng
    }


    public boolean Loi_Lom()//Nếu có điểm nằm bên trong 3 điểm còn lại tạo thành tứ giác lõm
    {
        if (DiemNamTrongTamGiac(d1, d2, d3, d4)==true)
            return false;
        else if (DiemNamTrongTamGiac(d1, d2, d4, d3)==true)
            return false;
        else if (DiemNamTrongTamGiac(d1, d3, d4, d2)==true)
            return false;
        else if (DiemNamTrongTamGiac(d2, d3, d4, d1)==true)
            return false;
        else 
            return true;
    }
    //nếu có 1 điểm nằm trong 3 điểm tạo thành tam giác thì tứ giác lõm
    //d4 là điểm so sánh có nằm trong 3 diem d1 d2 d3 không
    public boolean DiemNamTrongTamGiac(Point d1, Point d2, Point d3,Point d4)
    {
        double X = dientichtamgiac(d1, d2, d3);
        double A = dientichtamgiac(d1, d2, d4);
        double B = dientichtamgiac(d1, d3, d4);
        double C = dientichtamgiac(d2, d3, d4);

        if((A + B + C)> X)
            return false;//d4 nằm ngoài
        else
            return true;//d4 nằm trong
    }

    public double dientichtamgiac(Point a, Point b, Point c)
    {
        return 0.5*Math.abs(a.getX()* (b.getY() - c.getY()) + b.getX()*(c.getY()-a.getY())+c.getX()*(a.getY()-b.getY()));
    }

    private int ktcapcanh(Point d1, Point d2, Point d3, Point d4)//kiểm tra cặp cạnh không xuất phát cùng 1 điểm
    {
        float a1 = (d1.getY()-d2.getY()) / (d1.getX()-d2.getX());
        float a2 = (d3.getY()-d4.getY()) / (d3.getX()-d4.getX());
        
        if(a1*a2 == -1)//Vuông góc với nhau
            return 1;
        if (a1 == a2)//Song song với nhau
            return 2;
        else
            return 0;//2 đường thẳng cắt nhau
    }

    private int sogocvuong(Point d1, Point d2, Point d3, Point d4)//kiểm tra số góc vuông của hình
    {
        int dem = 0;
        //Điểm chung của góc là vị trí thứ nhất
        //Góc 1
        if(ktgocvuong(d1, d2, d3) == true)
            dem++;
        if(ktgocvuong(d1, d2, d4) == true)
            dem++;
        if(ktgocvuong(d1, d3, d4) == true)
            dem++;
        //Góc 2
        if(ktgocvuong(d2, d1, d3) == true)
            dem++;
        if(ktgocvuong(d2, d1, d4) == true)
            dem++;
        if(ktgocvuong(d2, d3, d4) == true)
            dem++;
        //Góc 3
        if(ktgocvuong(d3, d1, d2) == true)
            dem++;
        if(ktgocvuong(d3, d1, d4) == true)
            dem++;
        if(ktgocvuong(d3, d4, d2) == true)
            dem++;
        //Góc 4
        if(ktgocvuong(d4, d1, d2) == true)
            dem++;
        if(ktgocvuong(d4, d1, d3) == true)
            dem++;
        if(ktgocvuong(d4, d2, d3) == true)
            dem++;

        return dem;
    }

    private boolean ktgocvuong(Point d1, Point d2, Point d3) //góc có điểm chung là d1
    {
        //Tính độ dài bình phương cạnh
        //Nếu sử dụng độ dài cạnh nó sẽ bị sai số -> bỏ lỡ góc vuông
        double a = Math.pow(d1.getX() - d2.getX(),2) + Math.pow(d1.getY() - d2.getY(), 2);//Cạnh d1 d2
        double b = Math.pow(d1.getX() - d3.getX(),2) + Math.pow(d1.getY() - d3.getY(), 2);//Cạnh d1 d3
        double c = Math.pow(d2.getX() - d3.getX(),2) + Math.pow(d2.getY() - d3.getY(), 2);//Cạnh d2 d3
        if (c == a + b)
            return true;
        else
            return false;
    }

    private boolean Canh_Ke_Nhau()//so sánh độ dài 2 cạnh kề nhau
    {
        double a = Math.pow(d1.getX() - d2.getX(),2) + Math.pow(d1.getY() - d2.getY(), 2);//Cạnh d1 d2
        double b = Math.pow(d1.getX() - d3.getX(),2) + Math.pow(d1.getY() - d3.getY(), 2);//Cạnh d1 d3
        double c = Math.pow(d1.getX() - d4.getX(),2) + Math.pow(d1.getY() - d4.getY(), 2);//Cạnh d1 d4
        if(a == b||a == c||b == c)
            return true;
        else
            return false;
    }
}
