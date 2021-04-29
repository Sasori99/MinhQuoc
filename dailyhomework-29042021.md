Giả sử chúng ta đang tạo pull request từ branchB vào branchA 
-Create a merge commit
+ Dễ dàng việc theo dõi lịch sử thay đổi của toàn bộ source code
+ Sau khi thực hiện, trên branchA, các commit của branchA và branchB sẽ xuất hiện theo trình tự thời gian 

-Squash and merge
+ Giữ cho lịch sử commit trên branchA gọn gàng và dễ tracking
+ Các commit mới của branchB sẽ được gộp lại thành một và nối lên trước các commit của branchA

-Rebase and merge
+ Dễ dàng theo dõi sự thay đổi của từng branch, từ đó kiểm soát được công việc của từng thành viên dễ hơn
+ Commit từ branchB sẽ được nối vào đầu của branchA
