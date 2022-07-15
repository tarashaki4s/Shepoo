<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="row"">
	<div class="col-md-12 col-lg-12 col-sm-12">
		<div class="white-box">
			<div class="d-md-flex mb-3">
				<h3 class="box-title mb-0">Danh Sách sản phẩm</h3>
				<a href="/admin/addProduct"
				target="_blank"
				class="btn btn-danger  d-none d-md-block pull-right ms-3 hidden-xs hidden-sm waves-effect waves-light text-white">Thêm sản phẩm</a>
			</div>
			<div class="table-responsive">
				<table class="table no-wrap">
					<thead>
						<tr>
							<th class="border-top-0">#</th>
							<th class="border-top-0">Tên Sản phẩm</th>
							<th class="border-top-0">Giá bán</th>
							<th class="border-top-0">Số lượng</th>
							<th class="border-top-0">Thao tác</th>
						</tr>
					</thead>
					<c:forEach items="${sanPhamPage.content}" var="i" varStatus="loop">
						<form action="/admin/deleteProduct/${i.maSP}" method="post">
							<tbody>
								<tr>
									<td>${loop.index+1}</td>
									<td class="txt-oflo">${i.tenSP}</td>
									<td>${i.gia}</td>
									<td class="txt-oflo">${i.soLuong}</td>
									<td><span class="text-success">
											<a href="/admin/updateProduct/${i.maSP}">Sửa</a>
											<button class="btn btn-primary   text-white" type="submit">Xóa</button>
									</span></td>
								</tr>
		
							</tbody>
						</form>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</div>