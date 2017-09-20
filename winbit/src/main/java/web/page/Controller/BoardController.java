package web.page.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.page.DTO.BoardDto;
import web.page.Service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		try {
			
			model.addAttribute("list",service.bbsList());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "board/bbsList";
		
	}
	
	@RequestMapping(value="/listPage")
	public String listPage(@RequestParam("startBBS") int startBBS, @RequestParam("perPage") int perPage, Model model) {
		try {
			model.addAttribute("page",startBBS);
			model.addAttribute("list",service.pageView((startBBS-1)*perPage, perPage));
			model.addAttribute("tPage",service.totalBBS());
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "board/bbsList";
		
	}
	
	@RequestMapping("/bbsWrite")
	public String write(String title, String content, String writer) {
		try {
			
			int gNum = 0;
			
			if(service.maxGnum() == 0) {
				gNum = 1;
			}else if(service.maxGnum() != 0) {
				gNum = service.maxGnum()+1;
			}
			content = content.replace("\r\n", "<br>");
			BoardDto dto = new BoardDto();
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(writer);
			dto.setgNum(gNum);
			
			service.newWrite(dto);;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "home";
		
	}
	
	
	
	@RequestMapping(value ="/bbsWriteForm")
	public String writeFormView() {
		
		
		return "board/bbsWriteForm";
		
	}
	
	
	
	@RequestMapping(value ="/bbsContent", method = RequestMethod.GET)
	public String bbsContent(@RequestParam("bbsID")int bbsID, Model model) {
		
		try {
			
			model.addAttribute("content",service.contentView(bbsID));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "board/bbsContent";
		
	}
	
	@RequestMapping(value ="/reWriteForm", method = RequestMethod.POST)
	public String reWriteForm(int gNum, int lNum, int indent, Model model) {
		
		try {
			BoardDto dto = new BoardDto();
			dto.setgNum(gNum);
			dto.setlNum(lNum);
			dto.setIndent(indent);
			model.addAttribute("content2", dto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "board/reWriteForm";
		
	}
	
	@RequestMapping(value ="/bbsReWrite", method = RequestMethod.POST)
	public String reWrite(String title, String content, String writer, int gNum, int lNum, int indent, Model model) {
		
		try {
			
			BoardDto dto = new BoardDto();
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(writer);
			dto.setgNum(gNum);
			dto.setlNum(lNum);
			dto.setIndent(indent);
			
			service.reWrite(dto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/board/listPage?startBBS=1&perPage=10";
		
	}
	
	@RequestMapping(value ="/delete", method=RequestMethod.GET)
	public String bbsDelete(@RequestParam("bbsID")int bbsID, Model model) {
		
		try {
			
			service.bbsDelete(bbsID);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/board/listPage?startBBS=1&perPage=10";
		
	}
	
	
	@RequestMapping(value ="/modifyForm", method=RequestMethod.GET)
	public String bbsModify(@RequestParam("bbsID")int bbsID, Model model) {
		
		try {
			
			
			model.addAttribute("con",service.contentView(bbsID));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "board/modifyForm";
		
	}
	
	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String bbsModify(String title, String content, int bbsID, Model model) {
		
		try {
			
			service.bbsUpdate(title, content, bbsID);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/board/listPage?startBBS=1&perPage=10";
		
	}
	
	
	
	
	
	
	
	
	
}
