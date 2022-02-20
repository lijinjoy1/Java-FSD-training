package java_trainingtask2;

class Color {
	void paint()
	{
		System.out.println(" colors are painted");
	}
	
	void spray() {
		System.out.println(" colors are sprayed");
	}
}

class Red extends Color {
	void paint()
	{
		System.out.println(" red are painted");
	}
	
	void spray() {
		System.out.println(" colors are sprayed");
	}
}

class LightRed extends Red {
	void spray()
	{
		System.out.println("  light red are sprayed");
	}
	

class Method_overriding2{
public static void main(String[] args) {
		// TODO Auto-generated method stub
        Color s;
        s =new Red();
        s.paint();
        s.spray();
        s = new LightRed();
        s.paint();
        s.spray();
         
	}}

}

