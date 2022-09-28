// https://leetcode.com/problems/count-items-matching-a-rule/


class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int check;
            if (ruleKey.equals("type")){
                check = 0;
            }
            else if(ruleKey.equals("color")){
                check = 1;
            }
            else{
                check = 2;
            }
            int count = 0;
            for(int i=0;i<items.size();i++)
                if(items.get(i).get(check).equals(ruleValue))
                    count++;
            return count;
    }
}
