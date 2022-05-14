# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## step2
1. 게임 생성 : 구입금액에 따라 게임수 생성, 게임수 만큼 게임 생성
 1) 1개 게임 생성
 2) 1개 게임을 입력한 게임수만큼 반복

2. 당첨 : 생성된 게임과 당첨번호 비교
 1) 당첨번호와 구매한 로또 번호 비교하여 당첨 개수 출력
 2) 결과 값으로 Map 생성

3. 당첨 결과 및 수익률 출력