class Fruit{
  //品种
  String breed;
  //产地
  final String orgin;

  {
    orgin = "北京";~~
  }

  public Fruit(){
    breed = "";
    orgin = "";
  }

  public Fruit(Stirng breed,String orgin){
    this.breed = breed;
    this.orgin = orgin;
  }
}

class FinalTest{
  public static void main(String[] args){
    Fruit fruit = new Fruit();
    System.out.println("fruit breed is "+fruit.breed);
    System.out.println("fruit orin is "+fruit.orgin);
  }
}
