public class App1603 {
    public static void main(String[] args ) throws Exception{
        
        Preson a = new Preson();
        SinhVien b = new SinhVien();
        PhuongTrinhBacHai c = new PhuongTrinhBacHai();
        //Preson
        a.nhapPresonID();
        a.nhapPresonName();
        a.nhapGender();
        a.nhapAddress();
        System.out.print("\n\n");
        a.intt();

        System.out.print("\n\n");
        // sinhvien
        b.nhapMaSinhVien();
        b.nhapHoTen();
        b.nhapNgaySinh();
        b.nhapDiaChi();
        b.nhapGioiTinh();
        System.out.println("\n");
        b.intt();
        
        //ptb2
        c.nhapgiatri();
        c.inkq(c.giaiptb2());
    }
}
