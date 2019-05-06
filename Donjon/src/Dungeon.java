
public class Dungeon {
	
	Room map[][] = new Room[100][100];
	
	Dungeon() {
		
	}
	
	public void GenerateRoom(int x,int y,int direction) {
		map[x][y] = new Room(x,y,direction);
	}
	
	public Room GetRoom(int x,int y) {
		return map[x][y];
	}

	public Room[][] getMap() {
		return map;
	}
	
}
