## class

fields:

- constructor
- getters
- setters

### constructor

```

public Sth(type sth1,type2 sth2...){
this.sth1=sth1
this.sth2=sht2
.... 
}

```

在new一个对象时运行

Sth blah =new Sth('sht1','sth2')

#### priviate vs public

fields should be private

methods and constructor are public

#### getters

- getter is a function which return the copy of a field's value
- public
- return a new copy of the object

#### setters

- update fields
- create a new copy of the object

- ```
  public void setsth(String sth){
    this.sth=sth
  }
  ```
对象/数组的更新
```
this.cars[index]=new Car(car)//使用了 copy constructor，新建一个对象传入field数组
```

#### reference trap

值引用和地址引用

#### Constructor overload

copy constructor
```
public Car(Car source){
    this.sth1=source.sth1
    this.sth2=source.sth2
    this.sth3=source.sth3
    ...//how to copy an object
}
```

#### action

an action is a method that represents what a object can do

### toString

connects every field into a String

打印某个对象时，java自动用tostring方法（返回class name，symbol，一个表示hashcode的字符串）

nullporinterexception(尝试从null中获取属性)