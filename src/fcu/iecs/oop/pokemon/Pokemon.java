package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	private String nickName;
	public Pokemon(String nickName,PokemonType type,int cp) {
		this.nickName = nickName;
		this.cp = cp;
		this.type = type;
	}
	private int cp;
	private PokemonType type;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public PokemonType getType() {
		return type;
	}
	
	
	
}
