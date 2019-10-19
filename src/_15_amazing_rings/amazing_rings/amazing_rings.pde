void setup(){
size(1000,500);
}
int x1= 250;
int x2 = 750;
int s1 = 1;
int s2 = -1;

void draw(){
  background(0,255,172);
  x1+= s1;
  x2+=s2;
  if(x1==775||x1==225){
  s1*=-1;
  }
  if(x2==225||x2==775){
    s2*=-1;
  }
for(int i =450;i>11.25;i-=11.25){
  noFill();
circle(x1,250,i);
}
for(int i =450;i>11.25;i-=11.25){
  noFill();
circle(x2,250,i);
}
}
