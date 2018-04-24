PImage original, swan;
float xSwan, ySwan, swanSpeed;
boolean flip;     // doesn't work. in progress
void setup() {
 size(800, 600);
 original = loadImage("pondSwan.jpg"); 
 
 if (flip == false) {
   swan = loadImage("swan.png");
 } else if (flip == true) {
   swan = loadImage("swanTest.jpeg");
 }
 
 xSwan = width * 0.4;
 ySwan = height * 0.63; 
 swanSpeed = 2;
}

void draw() {
 
  image(original, 0, 0, width, height);
 
 
  xSwan -= swanSpeed;
  
  if (xSwan <= 220) {
    swanSpeed = -swanSpeed;
    flip = false;
  } else if (xSwan >= width-300) {
    swanSpeed = -swanSpeed;
    flip = true;
  }
  
  image(swan, xSwan, ySwan, width*0.09, height*0.09);
  println("x: " + mouseX + "  y: " + mouseY);  
}

// PVector[] clouds --> PVector is the type. Every element in the array will be a PVector
