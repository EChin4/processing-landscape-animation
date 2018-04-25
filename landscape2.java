float xLake, yLake, xShed, yShed, xShedSize, yShedSize, xBush, yBush, xBushSize, yBushSize, xSwan, ySwan, xSwanSize, ySwanSize, xSwanSpeed;

void setup() {
  size(1200, 600);
  xLake = 0;
  yLake = 350;
  
  yShedSize = 200;
  xShedSize = 300;
  xShed = 200;
  yShed = yLake - yShedSize/1.1;
  
  xBush = -25;
  yBush = height*0.65;
  xBushSize = 500;
  yBushSize = 200;
  
  xSwanSize = 160;
  ySwanSize = 100;
  xSwan = width/2;
  ySwan = yLake + xSwanSize/1.5;
  xSwanSpeed = 1.5;
}

void draw() {
  xSwan += xSwanSpeed;
  
  // swan boundaries. Need to flip image when switching sides.
  if (xSwan >= width - 200 || xSwan <= 450) {
    xSwanSpeed = -xSwanSpeed;
  }
  
  //background(#C7E9FF);
  background(#dcefef);
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
  fill(#b69b4c);
  rect(xShed, yShed + yShedSize, xShedSize, yShedSize/7.5);
  // bid shed door
  fill(#864000);
  rect(xShed + xShedSize/3, yShed + yShedSize/2, xShedSize/3, yShedSize/2);
  // smaller shed
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
  fill(#fcfdfc);
  ellipse(xSwan, ySwan, xSwanSize, ySwanSize);
  // swan neck
  ellipse(xSwan + xSwanSize*0.45, ySwan - ySwanSize*0.65, 30, 145);
  // beak (yellow/orange)
  //fill(#F9F237);
  fill(#fac200);
  ellipse(xSwan + xSwanSize*0.76, ySwan - ySwanSize*1.12, 80, 20);
  fill(0);
  // swan FACE
  fill(#fcfdfc);
  ellipse(xSwan + xSwanSize*0.6, ySwan - ySwanSize*1.25, 67, 53);
  // beak (black)
  fill(#2c2b2e);
  ellipse(xSwan + xSwanSize*0.79, ySwan - ySwanSize*1.2, xSwanSize*0.1, ySwanSize*0.25);
  // eye
  fill(#473850);
  ellipse(xSwan + xSwanSize*0.65, ySwan - ySwanSize*1.3, xSwanSize*0.06, ySwanSize*0.12);
  // wing
  fill(#f6f4f1);
  ellipse(xSwan - xSwanSize/6, ySwan - ySwanSize/8, xSwanSize*1.01, ySwanSize*0.85);
  
  // water covering swan belly
  fill(#78D4CE);
  rect(xSwan - xSwanSize*0.7, ySwan + ySwanSize/2.8, xSwanSize*1.2, ySwanSize/4);
}
