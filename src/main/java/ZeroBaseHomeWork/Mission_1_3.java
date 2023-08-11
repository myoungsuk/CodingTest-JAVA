package ZeroBaseHomeWork;

public class Mission_1_3 {
    public static void main(String[] args){

        long totalCount = 127;
        long pageIndex = 11;

        Pager pager = new Pager(totalCount);
        System.out.println(pager.html(pageIndex));
    }

    public static class Pager {

        private long totalCount;
        private int pageItems = 10;
        private int pageBlocks = 10;

        public Pager(long totalCount) {
            this.totalCount = totalCount;
        }

        public String html(long pageIndex) {
            long totalPage;
            long startPage = ((pageIndex-1) / pageBlocks) * pageBlocks + 1;
            long endPage = startPage +9;

            if(totalCount % 10 == 0){
                totalPage = (totalCount / 10);
            }else{
                totalPage = totalCount / 10 + 1;
            }


            if(endPage >= totalPage){
                endPage = totalPage;
            }else{
                endPage = startPage + 9;
            }


            String html = "<a href='#'>[처음]</a>\n<a href='#'>[이전]</a>\n\n";

            for(long i = startPage; i <= endPage; i++){
                if(i == pageIndex) {
                    html += "<a href='#' class='on'>" + i + "</a>\n";
                }else {
                    html += "<a href='#'>" + i + "</a>\n";
                }
            }
            html += "\n";

            html += "<a href='#'>[다음]</a>\n<a href='#'>[마지막]</a>\n";
            return html;

        }
    }
}
