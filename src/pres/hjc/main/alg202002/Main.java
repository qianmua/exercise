package pres.hjc.main.alg202002;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/1
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    /*

有奖猜谜

小明很喜欢猜谜语。
最近，他被邀请参加了X星球的猜谜活动。

每位选手开始的时候都被发给777个电子币。
规则是：猜对了，手里的电子币数目翻倍，
猜错了，扣除555个电子币, 扣完为止。

小明一共猜了15条谜语。
战果为：vxvxvxvxvxvxvvx
其中v表示猜对了，x表示猜错了。

请你计算一下，小明最后手里的电子币数目是多少。

请填写表示最后电子币数目的数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
     */
    private static void youJiangCaiMi(){
        String s = "vxvxvxvxvxvxvvx";
        int a = 777;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'v'){
                a *= 2;
            }else{
                a -= 555;
            }
        }
        System.out.println(a);
    }

    /*
A:
12894792, 92774113, 59529208, 22962224, 02991600, 83340521, 87365045,
40818286, 16400628, 39475245, 55933381, 76940287, 61366748, 95631228,
17102313, 50682833, 61562613, 87002524, 83062019, 51743442, 61977890,
32010762, 69680621, 87179571, 81761697, 32364296, 07833271, 36198035,
26588918, 84046668, 43059468, 73191775, 56794101, 00454780, 11141030,
10008994, 35072237, 44945158, 53959980, 75758119, 18560273, 35801494,
42102550, 22496415, 03981786, 34593672, 13074905, 07733442, 42374678,
23452507, 98586743, 30771281, 17703080, 52123562, 05898131, 56698981,
90758589, 18238802, 18217979, 04511837, 75682969, 31135682, 55379006,
42224598, 98263070, 40228312, 28924663, 11580163, 25686441, 45944028,
96731602, 53675990, 03854194, 14858183, 16866794, 40677007, 73141512,
32317341, 56641725, 43123040, 15201174, 62389950, 72887083, 76860787,
61046319, 06923746, 17874548, 46028629, 10577743, 48747364, 05328780,
59855415, 60965266, 20592606, 14471207, 70896866, 46938647, 33575820,
53426294, 56093931, 51326542, 94050481, 80114017, 33010503, 72971538,
22407422, 17305672, 78974338, 93209260, 83461794, 41247821, 26118061,
10657376, 42198057, 15338224, 50284714, 32232841, 26716521, 76048344,
23676625, 62897700, 69296551, 59653393, 38704390, 48481614, 69782897,
26850668, 37471053, 88720989, 51010849, 94951571, 60024611, 29808329,
70377786, 13899299, 09683688, 58218284, 46792829, 97221709, 45286643,
48158629, 57367208, 26903401, 76900414, 87927040, 09926730, 01508757,
15101101, 62491840, 43802529,

B:44894050, 34662733, 44141729, 92774113, 99208727, 91919833, 23727681,
10003409, 55933381, 54443275, 13584702, 96523685, 50682833, 61562613,
62380975, 20311684, 93200452, 23101945, 42192880, 28992561, 18460278,
19186537, 58465301, 01111066, 62680429, 23721241, 20277631, 91708977,
57514737, 03981786, 81541612, 07346443, 93154608, 19709455, 37446968,
17703080, 72378958, 66200696, 30610382, 89586343, 33152171, 67040930,
35696683, 63242065, 99948221, 96233367, 52593493, 98263070, 01418023,
74816705, 89375940, 58405334, 96731602, 84089545, 16866794, 94737626,
01673442, 70548494, 13638168, 08163691, 11106566, 64375392, 40267902,
00897705, 56447313, 54532235, 94738425, 66642634, 83219544, 40546096,
66924991, 20592606, 96037590, 73434467, 70896866, 91025618, 57892091,
08487641, 32500082, 84412833, 23311447, 38380409, 79957822, 72971538,
69645784, 91863314, 73099909, 93209260, 83461794, 81378487, 30423273,
22233715, 32232841, 26716521, 03511221, 29196547, 58263562, 56233305,
52547525, 55812835, 87253244, 52484232, 80837360, 94098464, 52028151,
53267501, 66381929, 84381316, 59788467, 09683688, 67082008, 71605255,
80654064, 21434307, 45286643, 76556656, 82465821, 57367208, 79218980,
48460468, 59170479, 46046391, 43043164, 96544490, 83340521, 70837892,
18926791, 40818286, 28936302, 11489524, 51031183, 73860337, 13241219,
09025448, 10718828, 76360986, 26031606, 76558053, 97726139, 46473415,
48406387, 23625539, 86756012, 35164187, 49161302, 78082834, 35072237,
08602486, 29815841, 56562216, 77684187, 81751704, 20160464, 50407962,
27786415, 19893526, 00934129, 37759498, 52636463, 25666982, 43262852,
38393436, 02581136, 29323250, 56950657, 05898131, 95286262, 75574581,
54057961, 06703896, 90758589, 57782642, 34492535, 41919697, 06395464,
10993500, 81212949, 34017532, 69569396, 99009936, 57129610, 67401593,
71044018, 62076698, 29533873, 71936325, 86874388, 26545032, 35695544,
30433724, 53127345, 72887083, 25390873, 63711546, 06923746, 27783723,
33199575, 35929698, 16491251, 18276792, 62744775, 92096155, 06336570,
56141974, 73007273, 31416832, 00171057, 64176982, 46938647, 58460388,
69972026, 73724304, 27435484, 51568616, 15531822, 47788699, 11818851,
41594694, 83561325, 43107163, 56965375, 10557343, 26118061, 74650126,
90076467, 10657376, 49901436, 03425162, 61164599, 15797769, 05427896,
14444084, 36795868, 18079449, 59653393, 72942548, 06763077, 33895610,
94892653, 12085268, 65174140, 79567366, 23020126, 74290047, 13498869,
21696323, 27724594, 54941003, 38229841, 07050068,

C:
13404901, 39952424, 47847739, 94939581, 13809950, 70966043, 11161555,
17102313, 47079425, 50682833, 74154313, 61562613, 93200452, 37103342,
18479435, 32502597, 36198035, 54210010, 73191775, 48358178, 85544503,
05996766, 54651623, 52113220, 27465181, 23871783, 22496415, 54107041,
65899605, 56528700, 82671109, 61176034, 42374678, 51612628, 63329997,
56591652, 04552733, 12789324, 89586343, 51935014, 38611966, 43916409,
70996050, 98263070, 01418023, 65345049, 21734275, 76846198, 71506230,
00833171, 67128139, 41367555, 64769510, 44010700, 16475199, 93164325,
09386162, 95324041, 80688223, 67629139, 79552617, 76219736, 50368644,
45096021, 54972488, 63779011, 28862942, 73145521, 74078605, 66924991,
12806850, 02171001, 70896866, 73434467, 08487641, 44415025, 32500082,
84412833, 83896188, 52243759, 49191410, 38744339, 48079796, 44937032,
06267501, 81866886, 38575984, 25978688, 78974338, 41247821, 12356966,
64842303, 79127158, 02366944, 68000570, 12426275, 96409230, 00705972,
08266503, 83820884, 08831807, 43273308, 23216105, 29196547, 95160161,
05553537, 52182214, 32641346, 91553427, 24436506, 77433749, 01979664,
52028151, 88985343, 01761499, 76203088, 63237368, 23405334, 59788467,
09683688, 67755443, 29946533, 12053603, 00437479, 15200030, 45286643,
93537527, 82465821, 57367208, 53899751, 15354933, 97760830, 68933762,
80220545, 01892750, 39868288, 21524323, 69716610, 65083815, 78048499,
03227391, 83340521, 87365045, 71720254, 51031183, 89168555, 08503028,
37086236, 25103057, 87002524, 22808816, 80928090, 90741678, 15993372,
99117082, 49938176, 21755083, 86903426, 87830263, 53959980, 75758119,
59781354, 58679691, 25666982, 56307643, 47180521, 62776522, 78136608,
44882734, 90758589, 08075999, 66303819, 23480347, 11580163, 87080118,
18329165, 92514163, 89404632, 92377859, 03912329, 17499963, 59699979,
79876366, 63894807, 37857001, 86003935, 90087123, 29433345, 80298948,
61531153, 61046319, 37839841, 19421134, 48747364, 35196916, 62484573,
59907079, 36845702, 21631642, 72739317, 26283700, 80114017, 76639390,
29154110, 35159758, 47788699, 11818851, 56520669, 36396767, 36031167,
83817428, 10657376, 90076467, 14676452, 11024560, 16327605, 76048344,
14444084, 95452011, 99612346, 65172562, 84813675, 88618282, 38704390,
27998014, 63859011, 33787505, 60024611, 16229880, 13899299, 35240335,
29173227, 45036451, 66177893, 82658333, 43100730, 44520187, 74290047,
85013538, 09926730, 27724594, 95148523, 20503000, 64390907, 26006953,
98116293, 97457666, 29017396, 04634371, 70791589,


标题：兴趣小组

为丰富同学们的业余文化生活，某高校学生会创办了3个兴趣小组
（以下称A组，B组，C组）。
每个小组的学生名单分别在【A.txt】,【B.txt】和【C.txt】中。
每个文件中存储的是学生的学号。

由于工作需要，我们现在想知道：
    既参加了A组，又参加了B组，但是没有参加C组的同学一共有多少人？

请你统计该数字并通过浏览器提交答案。

注意：答案是一个整数，不要提交任何多余的内容。

--------------------

笨笨有话说：
    哇塞！数字好多啊！一眼望过去就能发现相同的，好像没什么指望。
不过，可以排序啊，要是每个文件都是有序的，那就好多了。

歪歪有话说：
    排什么序啊，这么几行数字对计算机不是太轻松了吗？
    我看着需求怎么和中学学过的集合很像啊.....

     */
    private static void xingQu(){
        int[] arra = {12894792, 92774113, 59529208, 22962224, 2991600, 83340521, 87365045,
                40818286, 16400628, 39475245, 55933381, 76940287, 61366748, 95631228,
                17102313, 50682833, 61562613, 87002524, 83062019, 51743442, 61977890,
                32010762, 69680621, 87179571, 81761697, 32364296, 7833271, 36198035,
                26588918, 84046668, 43059468, 73191775, 56794101, 454780, 11141030,
                10008994, 35072237, 44945158, 53959980, 75758119, 18560273, 35801494,
                42102550, 22496415, 3981786, 34593672, 13074905, 7733442, 42374678,
                23452507, 98586743, 30771281, 17703080, 52123562, 5898131, 56698981,
                90758589, 18238802, 18217979, 4511837, 75682969, 31135682, 55379006,
                42224598, 98263070, 40228312, 28924663, 11580163, 25686441, 45944028,
                96731602, 53675990, 3854194, 14858183, 16866794, 40677007, 73141512,
                32317341, 56641725, 43123040, 15201174, 62389950, 72887083, 76860787,
                61046319, 6923746, 17874548, 46028629, 10577743, 48747364, 5328780,
                59855415, 60965266, 20592606, 14471207, 70896866, 46938647, 33575820,
                53426294, 56093931, 51326542, 94050481, 80114017, 33010503, 72971538,
                22407422, 17305672, 78974338, 93209260, 83461794, 41247821, 26118061,
                10657376, 42198057, 15338224, 50284714, 32232841, 26716521, 76048344,
                23676625, 62897700, 69296551, 59653393, 38704390, 48481614, 69782897,
                26850668, 37471053, 88720989, 51010849, 94951571, 60024611, 29808329,
                70377786, 13899299, 9683688, 58218284, 46792829, 97221709, 45286643,
                48158629, 57367208, 26903401, 76900414, 87927040, 9926730, 1508757,
                15101101, 62491840, 43802529};
        int[] arrb = {44894050, 34662733, 44141729, 92774113, 99208727, 91919833, 23727681,
                10003409, 55933381, 54443275, 13584702, 96523685, 50682833, 61562613,
                62380975, 20311684, 93200452, 23101945, 42192880, 28992561, 18460278,
                19186537, 58465301, 1111066, 62680429, 23721241, 20277631, 91708977,
                57514737, 3981786, 81541612, 7346443, 93154608, 19709455, 37446968,
                17703080, 72378958, 66200696, 30610382, 89586343, 33152171, 67040930,
                35696683, 63242065, 99948221, 96233367, 52593493, 98263070, 1418023,
                74816705, 89375940, 58405334, 96731602, 84089545, 16866794, 94737626,
                1673442, 70548494, 13638168, 8163691, 11106566, 64375392, 40267902,
                897705, 56447313, 54532235, 94738425, 66642634, 83219544, 40546096,
                66924991, 20592606, 96037590, 73434467, 70896866, 91025618, 57892091,
                8487641, 32500082, 84412833, 23311447, 38380409, 79957822, 72971538,
                69645784, 91863314, 73099909, 93209260, 83461794, 81378487, 30423273,
                22233715, 32232841, 26716521, 3511221, 29196547, 58263562, 56233305,
                52547525, 55812835, 87253244, 52484232, 80837360, 94098464, 52028151,
                53267501, 66381929, 84381316, 59788467, 9683688, 67082008, 71605255,
                80654064, 21434307, 45286643, 76556656, 82465821, 57367208, 79218980,
                48460468, 59170479, 46046391, 43043164, 96544490, 83340521, 70837892,
                18926791, 40818286, 28936302, 11489524, 51031183, 73860337, 13241219,
                9025448, 10718828, 76360986, 26031606, 76558053, 97726139, 46473415,
                48406387, 23625539, 86756012, 35164187, 49161302, 78082834, 35072237,
                8602486, 29815841, 56562216, 77684187, 81751704, 20160464, 50407962,
                27786415, 19893526, 934129, 37759498, 52636463, 25666982, 43262852,
                38393436, 2581136, 29323250, 56950657, 5898131, 95286262, 75574581,
                54057961, 6703896, 90758589, 57782642, 34492535, 41919697, 6395464,
                10993500, 81212949, 34017532, 69569396, 99009936, 57129610, 67401593,
                71044018, 62076698, 29533873, 71936325, 86874388, 26545032, 35695544,
                30433724, 53127345, 72887083, 25390873, 63711546, 6923746, 27783723,
                33199575, 35929698, 16491251, 18276792, 62744775, 92096155, 6336570,
                56141974, 73007273, 31416832, 171057, 64176982, 46938647, 58460388,
                69972026, 73724304, 27435484, 51568616, 15531822, 47788699, 11818851,
                41594694, 83561325, 43107163, 56965375, 10557343, 26118061, 74650126,
                90076467, 10657376, 49901436, 3425162, 61164599, 15797769, 5427896,
                14444084, 36795868, 18079449, 59653393, 72942548, 6763077, 33895610,
                94892653, 12085268, 65174140, 79567366, 23020126, 74290047, 13498869,
                21696323, 27724594, 54941003, 38229841, 7050068};
        int[] arrc = {13404901, 39952424, 47847739, 94939581, 13809950, 70966043, 11161555,
                17102313, 47079425, 50682833, 74154313, 61562613, 93200452, 37103342,
                18479435, 32502597, 36198035, 54210010, 73191775, 48358178, 85544503,
                5996766, 54651623, 52113220, 27465181, 23871783, 22496415, 54107041,
                65899605, 56528700, 82671109, 61176034, 42374678, 51612628, 63329997,
                56591652, 4552733, 12789324, 89586343, 51935014, 38611966, 43916409,
                70996050, 98263070, 1418023, 65345049, 21734275, 76846198, 71506230,
                833171, 67128139, 41367555, 64769510, 44010700, 16475199, 93164325,
                9386162, 95324041, 80688223, 67629139, 79552617, 76219736, 50368644,
                45096021, 54972488, 63779011, 28862942, 73145521, 74078605, 66924991,
                12806850, 2171001, 70896866, 73434467, 8487641, 44415025, 32500082,
                84412833, 83896188, 52243759, 49191410, 38744339, 48079796, 44937032,
                6267501, 81866886, 38575984, 25978688, 78974338, 41247821, 12356966,
                64842303, 79127158, 2366944, 68000570, 12426275, 96409230, 705972,
                8266503, 83820884, 8831807, 43273308, 23216105, 29196547, 95160161,
                5553537, 52182214, 32641346, 91553427, 24436506, 77433749, 1979664,
                52028151, 88985343, 1761499, 76203088, 63237368, 23405334, 59788467,
                9683688, 67755443, 29946533, 12053603, 437479, 15200030, 45286643,
                93537527, 82465821, 57367208, 53899751, 15354933, 97760830, 68933762,
                80220545, 1892750, 39868288, 21524323, 69716610, 65083815, 78048499,
                3227391, 83340521, 87365045, 71720254, 51031183, 89168555, 8503028,
                37086236, 25103057, 87002524, 22808816, 80928090, 90741678, 15993372,
                99117082, 49938176, 21755083, 86903426, 87830263, 53959980, 75758119,
                59781354, 58679691, 25666982, 56307643, 47180521, 62776522, 78136608,
                44882734, 90758589, 8075999, 66303819, 23480347, 11580163, 87080118,
                18329165, 92514163, 89404632, 92377859, 3912329, 17499963, 59699979,
                79876366, 63894807, 37857001, 86003935, 90087123, 29433345, 80298948,
                61531153, 61046319, 37839841, 19421134, 48747364, 35196916, 62484573,
                59907079, 36845702, 21631642, 72739317, 26283700, 80114017, 76639390,
                29154110, 35159758, 47788699, 11818851, 56520669, 36396767, 36031167,
                83817428, 10657376, 90076467, 14676452, 11024560, 16327605, 76048344,
                14444084, 95452011, 99612346, 65172562, 84813675, 88618282, 38704390,
                27998014, 63859011, 33787505, 60024611, 16229880, 13899299, 35240335,
                29173227, 45036451, 66177893, 82658333, 43100730, 44520187, 74290047,
                85013538, 9926730, 27724594, 95148523, 20503000, 64390907, 26006953,
                98116293, 97457666, 29017396, 4634371, 70791589};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arra.length ; i++) {
            for (int j = 0; j < arrb.length ; j++) {
                if (arra[i] == arrb[j]){
                    list.add(arra[i]);
                }
            }
        }
        int temp = 0;
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < arrc.length ; j++) {
                if (list.get(i) == arrc[j]){
                    temp ++;
                }
            }
        }
        System.out.println(list.size() - temp);
    }

    /*

标题：纸牌三角形

A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
下图就是一种排法（如有对齐问题，参看p1.png）。
1 + 2 + 3 + 4
4 + 5 + 6 + 7
7 + 8 + 9 + 1
      A
     9 6
    4   8
   3 7 5 2

这样的排法可能会有很多。

如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

请你计算并提交该数字。

注意：需要提交的是一个整数，不要提交任何多余内容。

---------------------------

笨笨有话说：
    感觉可以暴力破解哦。
    麻烦的是，对每个排法还要算出它的旋转、镜像排法，看看有没有和历史重复。

歪歪有话说：
    人家又不让你把所有情况都打印出来，只是要算种类数。
    对于每个基本局面，通过旋转、镜像能造出来的新局面数目不是固定的吗？



     */
    static int count = 0;
    private static void zhiPaiSanJiaoXing(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        all(arr,0,arr.length-1);
        System.out.println(count/6);
    }

    private static void all(int[] arr , int s ,int e){
        if (s == e){
            if ((arr[0] + arr[1] + arr[2] + arr[3]) == (arr[3] + arr[4] + arr[5] + arr[6])
                    && (arr[3] + arr[4] + arr[5] + arr[6]) == (arr[6] + arr[7] + arr[8] + arr[0])){
                count++;
            }
            return ;
        }
        for (int i = s; i <= e ; i++) {
            swap(arr,i, s);
            all(arr, s + 1, e);
            swap(arr,i , s);
        }
    }

    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*

标题：承压计算

X星球的高科技实验室中整齐地堆放着某批珍贵金属原料。

每块金属原料的外形、尺寸完全一致，但重量不同。
金属材料被严格地堆放成金字塔形。

                             7
                            5 8
                           7 8 8
                          9 2 7 2
                         8 1 4 9 1
                        8 1 8 8 4 1
                       7 9 6 1 4 5 4
                      5 6 5 5 6 9 5 6
                     5 5 4 7 9 3 5 5 1
                    7 5 7 9 7 4 7 3 3 1
                   4 6 4 5 5 8 8 3 2 4 3
                  1 1 3 3 1 6 6 5 5 4 4 2
                 9 9 9 2 1 9 1 9 2 9 5 7 9
                4 3 3 7 7 9 3 6 1 3 8 8 3 7
               3 6 8 1 5 3 9 5 8 3 8 1 8 3 3
              8 3 2 3 3 5 5 8 5 4 2 8 6 7 6 9
             8 1 8 1 8 4 6 2 2 1 7 9 4 2 3 3 4
            2 8 4 2 2 9 9 2 8 3 4 9 6 3 9 4 6 9
           7 9 7 4 9 7 6 6 2 8 9 4 1 8 1 7 2 1 6
          9 2 8 6 4 2 7 9 5 4 1 2 5 1 7 3 9 8 3 3
         5 2 1 6 7 9 3 2 8 9 5 5 6 6 6 2 1 8 7 9 9
        6 7 1 8 8 7 5 3 6 5 4 7 3 4 6 7 8 1 3 2 7 4
       2 2 6 3 5 3 4 9 2 4 5 7 6 6 3 2 7 2 4 8 5 5 4
      7 4 4 5 8 3 3 8 1 8 6 3 2 1 6 2 6 4 6 3 8 2 9 6
     1 2 4 1 3 3 5 3 4 9 6 3 8 6 5 9 1 5 3 2 6 8 8 5 3
    2 2 7 9 3 3 2 8 6 9 8 4 4 9 5 8 2 6 3 4 8 4 9 3 8 8
   7 7 7 9 7 5 2 7 9 2 5 1 9 2 6 5 3 9 3 5 7 3 5 4 2 8 9
  7 7 6 6 8 7 5 5 8 2 4 7 7 4 7 2 6 9 2 1 8 2 9 8 5 7 3 6
 5 9 4 5 5 7 5 5 6 3 5 3 9 5 8 9 5 4 1 2 6 1 4 3 5 3 2 4 1
X X X X X X X X X X X X X X X X X X X X X X X X X X X X X X

其中的数字代表金属块的重量（计量单位较大）。
最下一层的X代表30台极高精度的电子秤。

假设每块原料的重量都十分精确地平均落在下方的两个金属块上，
最后，所有的金属块的重量都严格精确地平分落在最底层的电子秤上。
电子秤的计量单位很小，所以显示的数字很大。

工作人员发现，其中读数最小的电子秤的示数为：2086458231000

请你推算出：读数最大的电子秤的示数为多少？

注意：需要提交的是一个整数，不要填写任何多余的内容。

--------------------------------------------

笨笨有话说：
    不断的除2，加到下面，除2,加到下面,.... 不会浮点精度溢出吧？
歪歪有话说：
    怕除不开还不好办， 把每个数字扩大一定的倍数不就好了。


     */
    private static void chengYaJiSuan(){
        Scanner scanner = new Scanner(System.in);
        double[] arr1 ;
        for (int i = 2; i <= 29 ; i++) {
            int temp = 7000;
            arr1 = new double[(i - 1) * 2];
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = (temp) / 2;
            }
            for (int j = 0; j < i ; j++) {
                if (i != 1){
                    temp = scanner.nextInt() * 1000;
                    temp += arr1[j];
                }else{
                    temp = scanner.nextInt() * 1000;
                }
                if (i == 29){
                    System.out.println(temp);
                }
            }
        }
    }

    /*

标题： 杨辉三角

杨辉三角也叫帕斯卡三角，在很多数量关系中可以看到，十分重要。

第0行：           1
第1行：          1 1
第2行：         1 2 1
第3行：        1 3 3 1
第4行：       1 4 6 4 1
....

两边的元素都是1， 中间的元素是左上角的元素与右上角的元素和。

我们约定，行号，列号都从0计数。
所以： 第6行的第2个元素是15，第3个元素是20

直观地看，需要开辟一个二维数组，其实一维数组也可以胜任。
如下程序就是用一维数组“腾挪”的解法。

public class A
{
	// 杨辉三角形的第row行第col列
	static long f(int row, int col){
		if(row<2) return 1;
		if(col==0) return 1;
		if(col==row) return 1;

		long[] a = new long[row+1];
		a[0]=1;
		a[1]=1;

		int p = 2;

		while(p<=row){
			a[p] = 1;
			for( __________________ ) a[q] = a[q] + a[q-1];
			p++;
		}

		return a[col];
	}

	public static void main(String[] args){
		System.out.println(f(6,2));
		System.out.println(f(6,3));
	}
}
请仔细分析源码，并完成划线部分缺少的代码。
注意：只提交缺少的代码，不要提交已有的代码和符号。也不要提交说明性文字。
     */
    private static void yangHuiSanJiao(){
        System.out.println(f(6,2));
        System.out.println(f(6,3));
    }

    static long f(int row, int col){
        if(row<2) return 1;
        if(col==0) return 1;
        if(col==row) return 1;

        long[] a = new long[row+1];
        a[0]=1;
        a[1]=1;

        int p = 2;

        while(p<=row){
            a[p] = 1;
            for(int q = p-1; q > 0; q--) a[q] = a[q] + a[q-1];
            p++;
        }

        return a[col];
    }

    /*

标题：最大公共子串

最大公共子串就是求两个串的所有子串中能够匹配上的最大长度是多少。

比如："abcdkkk" 和 "baabcdadabc"，
可以找到的最长的公共子串是"abcd",所以最大公共子串长度为4。

下面的程序是采用矩阵法进行求解的，这对串的规模不大的情况还是比较有效的解法。

请分析该解法的思路，并补全划线部分缺失的代码。

public class A
{
	static int f(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[][] a = new int[c1.length+1][c2.length+1];

		int max = 0;
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				if(c1[i-1]==c2[j-1]) {
					a[i][j] = _______________________ ; //填空
					if(a[i][j] > max) max = a[i][j];
				}
			}
		}

		return max;
	}

	public static void main(String[] args){
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}
}

注意：只提交缺少的代码，不要提交已有的代码和符号。也不要提交说明性文字。
     */

    private static void zuiDaGongGongZiChuan(){
        int n = f("abcdekkk", "baabcdeadabc");
        System.out.println(n);
    }

    static int f(String s1, String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int[][] a = new int[c1.length+1][c2.length+1];

        int max = 0;
        for(int i=1; i<a.length; i++){
            for(int j=1; j<a[i].length; j++){
                if(c1[i-1]==c2[j-1]) {
                    a[i][j] = i; //填空
                    if(a[i][j] > max) max = a[i][j];
                }
            }
        }

        return max;
    }

    /*

标题： Excel地址

Excel单元格的地址表示很有趣，它使用字母来表示列号。
比如，
A表示第1列，
B表示第2列，
Z表示第26列，
AA表示第27列，
AB表示第28列，
BA表示第53列，
....

当然Excel的最大列号是有限度的，所以转换起来不难。
如果我们想把这种表示法一般化，可以把很大的数字转换为很长的字母序列呢？

本题目既是要求对输入的数字, 输出其对应的Excel地址表示方式。

例如，
输入：
26
则程序应该输出：
Z

再例如，
输入：
2054
则程序应该输出：
BZZ

我们约定，输入的整数范围[1,2147483647]

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。
主类的名字必须是：Main，否则按无效代码处理。

------------------------------

笨笨有话说：
    这有点像进制关系，又不完全是。好像末2位是以1当26，末3位是以1当26*26

歪歪有话说：
    要是从字母序列转数字还好点，倒过来有点麻烦，不过计算机跑得快啊。




     */
    private static void diZhi(){
        int a = new Scanner(System.in).nextInt();
        int max = 0;
        int arr[] = new int[7];
        while(a > 0) {
            max++;
            arr[max]=a%26;
            a/=26;
            if(arr[max]==0) {
                arr[max]=26;
                a--;
            }
        }
        for(int j=max;j>0;j--) {
            System.out.print((char)(arr[j]-1+'A'));
        }
    }
    public static void main(String[] args) {
        diZhi();
    }
}
