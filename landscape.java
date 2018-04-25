PImage original, swan, swan2;
float xSwan, ySwan, swanSpeed;

void setup() {
 size(800, 600);
 original = loadImage("pondSwan.jpg"); 
 swan = loadImage("swan.png");
 xSwan = width * 0.4;
 ySwan = height * 0.63; 
 swanSpeed = 2;
}

void draw() {
 
  image(original, 0, 0, width, height);
  image(swan, xSwan, ySwan, width*0.09, height*0.09);
 
  xSwan -= swanSpeed;
  
  if (xSwan <= 220 || xSwan >= width-300) {     // need to flip image when turning
    swanSpeed = -swanSpeed; 
  } 

  println("x: " + mouseX + "  y: " + mouseY);  
}

// PVector[] clouds --> PVector is the type. Every element in the array will be a PVector
// gravity acts on the speed and the speed affects the objects 
