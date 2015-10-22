package cn.zucc.day04;

public class Master {
	public void Cure(Pet pet){
		pet.Cure();
	}
	public void Play(Pet pet){
		if(pet instanceof Dog){
			Dog dog = (Dog)pet ;
			dog.Play();
			
		 
	}else if(pet instanceof Penguin){
		Penguin pg = (Penguin)pet ; 
		pg.Play();
	}

	}
}
