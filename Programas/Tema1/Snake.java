import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Snake {
    
    private ArrayList<Point> largo = new ArrayList<Point>();
    private int snakeX=0;
    private int snakeY=0;
    
    public Snake(){
        largo.add(new Point(20, 15));
    }
    
    public ArrayList<Point> getLargo()
    {
        return largo;   
    }
    
    public void dibujoSnake(Graphics g){
        
        for(int n = 0; n < largo.size(); n++) {
            g.setColor(Color.GREEN);
            Point p = largo.get(n);
            g.fillRect(p.x*20, p.y*20, 20, 20);
        }
        
    }
    
    public void muevoSnake() {
        for(int n = largo.size()-1; n > 0; n--) {
            largo.get(n).setLocation(largo.get(n-1));
            }
        largo.get(0).x += snakeX;
        largo.get(0).y += snakeY;
    }
    
    public void crecerColaSnake () {
            largo.add(new Point());
        }
    
    public void direccion(String d)
    {
        switch(d){
            case "ARR":
                snakeX = 0;
                snakeY = -1;
                break;
            case "ABA":
                snakeX = 0;
                snakeY = 1;
                break;
            case "IZQ":
                snakeX = -1;
                snakeY = 0;
                break;
            case "DER":
                snakeX = 1;
                snakeY = 0;
                break;
            
        }
    }
}