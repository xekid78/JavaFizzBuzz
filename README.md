# JavaFizzBuzz
JavaでFizzBuzz

## 処理
ウィキペディアより抜粋
>最初のプレイヤーは「1」と数字を発言する。次のプレイヤーは直前のプレイヤーの次の数字を発言していく。ただし、3で割り切れる場合は「Fizz」（Bizz Buzzの場合は「Bizz」）、5で割り切れる場合は「Buzz」、両者で割り切れる場合（すなわち15で割り切れる場合）は「Fizz Buzz」  

今回は2で割り切れる場合は「Fizz」、3で割り切れる場合は「Buzz」、両者で割り切れる場合（すなわち6で割り切れる場合）は「Fizz Buzz」とする。

## コード
```
public class Fizzbuzz {

	public static void main(String[] args) {
		String output;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                output = i + ": FizzBuzz";
            } else if (i % 2 == 0) {
                output = i + ": Fizz";
            } else if (i % 3 == 0) {
                output = i + ": Buzz";
            } else {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }

	}

}
```

## 出力結果  
```
1
2: Fizz
3: Buzz
4: Fizz
5
6: FizzBuzz
7
8: Fizz
9: Buzz
10: Fizz
11
12: FizzBuzz
13
14: Fizz
15: Buzz
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
