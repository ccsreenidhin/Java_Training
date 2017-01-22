package en;

class Season {
	enum season{
		Wint(7),Sum(13),Spri(6),Fall(4);
		
		private int value;
		private season(int value){
			this.value=value;
		}
		
	}

	public static void main(String[] args) {
		for(season s:season.values())
		{
			System.out.println(s+" "+s.value);
		}

	}

}
