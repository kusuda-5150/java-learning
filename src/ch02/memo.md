## 問題1

### 修正点
- 出力文の脱字に気をつける


## 問題2

### 修正点
- スコアレートの計算法を理解する

### メモ
  - Javaでは `int / int` の割り算をすると、小数部分が切り捨てられる。
  <br>double scoreRate = (score / maxScore) * 100;
  <br>//結果は 0.0 になる


## 問題2

### 修正点
- 平均BPの計算法を理解する

### メモ
- Javaでは `int / int` の割り算をすると、小数部分が切り捨てられる。
  <br>double averageBp = (double) ((totalBpBefore + currentBp) / playCountAfter);
  <br>// 先に 290 / 3 が整数割り算されるため、結果は 96.0 になる


