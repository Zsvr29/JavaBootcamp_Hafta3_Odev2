
public class Main {

	public static void main(String[] args) {
		
		//OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
		//System.out.println(ogretmenKrediManager.hesapla(1000));
		BaseKrediManager[] baseKrediManager=new BaseKrediManager[]{ new OgretmenKrediManager(),new TarımKrediManager(), new OgrenciKrediManager()};
		for(BaseKrediManager kredi:baseKrediManager) {
		System.out.println(kredi.hesapla(1000));
		}
		
	}

}
