
void setup() {
    size(600,600);
}
void draw() {
  noStroke();
  fill(191,141,60);
  ellipse(300,300,200,200);
  fill(255,0,0);
  ellipse(300,300,185,185);
  fill(255,255,0);
  ellipse(300,300,170,170);
 
 if(mousePressed){
   PImage pepperoni = loadImage("peper.png");
   pepperoni.resize(400,200);
image(pepperoni, 100, 200);
 }
}
