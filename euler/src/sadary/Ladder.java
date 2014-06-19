package sadary;

import java.util.HashMap;
import java.util.Map;


public class Ladder {
 
 private Map<Integer, Map<Integer, Integer>> ladderMap;
 private int maxHeight;
 
 public Map<Integer, Map<Integer, Integer>> getLadderMap() {
  return ladderMap;
 }
 public int getMaxHeight() {
  return maxHeight;
 }

 /**
  * 사다리 정보를 입력
  * @param height
  * @param line
  */
 public void setLadderInfo(int height, int line){
  if (ladderMap == null) {
   ladderMap = new HashMap<Integer, Map<Integer,Integer>>();
  }
  
  if (ladderMap.get(line) == null) {
   ladderMap.put(line, new HashMap<Integer,Integer>());
  }
  
  if (ladderMap.get(line+1) == null) {
   ladderMap.put(line+1, new HashMap<Integer,Integer>());
  }
  
  ladderMap.get(line).put(height, line+1);
  ladderMap.get(line+1).put(height, line);
  
  if (maxHeight < height) {
   maxHeight = height;
  }
 }
 
 /**
  * 결과 출력
  * @param line
  * @return
  */
 public int getResult(int line){
  
  int index = 0;
  Map<Integer, Integer> ladder = ladderMap.get(line);
  
  for (int i = 1; i <= maxHeight; i++) {
   if (ladder.containsKey(i)) {
    index = (Integer) ladder.get(i);
    ladder = ladderMap.get(index);
   }
  }
  return index;
 }
}
