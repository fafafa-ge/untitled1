import java.util.List;

/**
 * @author LiuChang
 * @date 2023/11/23 16:47
 * description
 */
public class FuzzyQueryBean {
    //    [
    //    {
    //        "left": "(",
    //            "right": ")",
    //            "lastConnector": "",
    //            "nextConnector": "",
    //            "conditionArr": [
    //        {
    //            "lastConnector": "and",
    //                "nextConnector": "and",
    //                "column": "asnNo",
    //                "logic": "7",
    //                "expectVal": "1223"
    //        }
    //        ]
    //    }
    //]
    private String left;
    private String right;
    private String lastConnector;
    private String nextConnector;
    private List<ConditionBean> conditionArr;

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getLastConnector() {
        return lastConnector;
    }

    public void setLastConnector(String lastConnector) {
        this.lastConnector = lastConnector;
    }

    public String getNextConnector() {
        return nextConnector;
    }

    public void setNextConnector(String nextConnector) {
        this.nextConnector = nextConnector;
    }

    public List<ConditionBean> getConditionArr() {
        return conditionArr;
    }

    public void setConditionArr(List<ConditionBean> conditionArr) {
        this.conditionArr = conditionArr;
    }

    public static class ConditionBean{
        private String lastConnector;
        private String nextConnector;
        private String column;
        private String logic;
        private String expectVal;

        public String getLastConnector() {
            return lastConnector;
        }

        public void setLastConnector(String lastConnector) {
            this.lastConnector = lastConnector;
        }

        public String getNextConnector() {
            return nextConnector;
        }

        public void setNextConnector(String nextConnector) {
            this.nextConnector = nextConnector;
        }

        public String getColumn() {
            return column;
        }

        public void setColumn(String column) {
            this.column = column;
        }

        public String getLogic() {
            return logic;
        }

        public void setLogic(String logic) {
            this.logic = logic;
        }

        public String getExpectVal() {
            return expectVal;
        }

        public void setExpectVal(String expectVal) {
            this.expectVal = expectVal;
        }
    }
}
