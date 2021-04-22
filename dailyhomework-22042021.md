- Branh trong git:
    + Tại sao phải dùng Branh?: Trong quá trình phát triển dự án, sẽ có rất nhiều người tham gia xây dưng, mỗi người sẽ 
      nhận 1 chức năng riêng, các thành viên sẽ tạo branch dùng riêng cho công việc của mình từ branch chính để không
      ảnh hưởng đến công việc của các thành viên khác.
    + Branch là gì?: Branch là cái dùng để phân nhánh và ghi lại luồng lịch sử. Branch đã phân nhánh sẽ không ảnh hưởng
      đến branch khác nên có thể tiến hành nhiều thay đổi đồng thời trong cùng 1 repo. Các branch có thể chỉnh sửa tổng 
      hợp lại thành 1 branch bẳng việc merge.
    + Khi nào dùng Branch?: khi muốn phát triển hoặc sửa lỗi song song nhiều công việc, chúng ta sẽ cần sử dụng branch
    + Sử dụng branch như thế nào?:
        . Khi tiến hành commit lần đầu trong repo, git sẽ tạo ra một branch có tên là master. Vì thế những lần commit
          tiếp theo sẽ được thêm vào branch master cho đến khi chuyển đổi branch.
        . Để tạo ra 1 nhánh mới từ 1 branch gốc, chúng ta sử dụng câu lệnh: git branch <tên branch>
        . Để chuyển đổi qua branch khác, chúng ta sẽ sử dụng câu lệnh: git checkout <tên branch>
        . Để tạo mới và chuyển đổi qua branch mới, chúng ta sẽ sử dụng câu lệnh: git checkout -b <tên branch>
        . Để merge 1 branch khác vào branch hiện tại, chúng ta sẽ sử dụng câu lệnh: git merge <tên branch>
        . Để rebase 1 branch khác vào branch hiện tại, chúng ta sẽ sử dụng câu lệnh: git rebase <tên branch>
        . Khi merge 2 branch sẽ xảy ra trường hợp conflict khi 2 branch đều thay đổi nội dung tại file trên cùng 1 dòng
          và khi đó chúng ta sẽ cần phải fix conflict. Git sẽ đánh dấu nơi bị conflict ở trong cặp dấu '<<<<<<<' và '>>>>>>>'
        . Theo 1 git flow thông thường, trong 1 dự phát triển phần mềm sẽ có các branch: 
            - Master: branch chính, chứa sản phẩm cuối cùng và ổn định dự án
            - Release: branch chứa các bản alpha, bản dùng thử của dự án
            - Dev: Branch phát triển, được tách từ nhánh master, và sẽ được merge vào nhánh Release sau mỗi sprint
            - Feature branch: Branch tính năng, đươc tách từ branch dev. Đây là nơi chúng ta sẽ phát triển và sửa lỗi các 
              tính năng của dự án và sẽ được merge lại Dev sau khi hoàn thiện.          
            - Hotfixes: Được tách trực tiếp từ branch master, đây là nơi sẽ chúng ta sẽ hot fix những lỗi khẩn cấp trên 
              bản chính và sẽ được merge trở lại branch dev và master sau khi xử lý lỗi xong
    + Ai là người sử dụng branch: tất cả các nhà phát triển phần mềm đều cần phải nắm được cách sử dụng branch
    + Branch được sử dụng ở đâu: ở mọi dự án mà sử dụng git làm version control.
