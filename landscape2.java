float xLake, yLake, xShed, yShed, xShedSize, yShedSize, xBush, yBush, xBushSize, yBushSize, xSwan, ySwan, xSwanSize, ySwanSize, xSwanSpeed;

void setup() {
  size(1100, 600);
  xLake = 0;
  yLake = 400;
  
  yShedSize = 200;
  xShedSize = 300;
  xShed = 200;
  yShed = yLake - yShedSize;
  
  xBush = -25;
  yBush = height*0.65;
  xBushSize = 500;
  yBushSize = 200;
  
  xSwanSize = 130;
  ySwanSize = 90;
  xSwan = width/2;
  ySwan = yLake + xSwanSize/2;
  xSwanSpeed = 1.5;
}

void draw() {
  xSwan += xSwanSpeed;
  
  // swan boundaries. Need to flip image when switching sides.
  if (xSwan >= width - 200 || xSwan <= 300) {
    xSwanSpeed = -xSwanSpeed;
  }
  
  background(#C7E9FF);
  noStroke();
  
  // lake
  fill(#78D4CE);
  rect(xLake, yLake, width, height/2);
  
  // shed's roof
  fill(#875B5B);
  quad(xShed, yShed, xShed + 100, yShed - 70, xShed + 200, yShed - 70, xShed + xShedSize, yShed);
  
  // sheds
  fill(#CC0066);
  rect(xShed, yShed, xShedSize, yShedSize);
  fill(#BC005E);
  rect(xShed - 100, yShed + 70, 100, yShedSize - 70);
  
  // bushes
  fill(#66CC00);
  ellipse(xBush, yBush, xBushSize, yBushSize);
  fill(#8DEB30);
  ellipse(xBush + xBushSize/2, yBush + 40, xBushSize/2, yBushSize/2);
  fill(#75D246);
  ellipse(xBush + 50, yBush + 70, 260, 80);
  
  // swan body. looks more like a duck tbh
  fill(255);
  ellipse(xSwan, ySwan, xSwanSize, ySwanSize);
  // swan neck
  ellipse(xSwan + xSwanSize*0.45, ySwan - ySwanSize/2, 30, 120);
  // beak
  fill(#F9F237);
  ellipse(xSwan + xSwanSize*0.8, ySwan - ySwanSize, 80, 20);
  // swan FACE
  fill(255);
  ellipse(xSwan + xSwanSize*0.55, ySwan - ySwanSize, 55, 55); 
  // eye
  fill(0);
  ellipse(xSwan + xSwanSize*0.6, ySwan - ySwanSize*1.1, 9, 6);
  
}
