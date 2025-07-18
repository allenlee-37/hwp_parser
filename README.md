# HWP parser development doc

KT 프로젝트: HWP 문서(hwp, hwpx, hwpml 등)를 파싱하여 KT 메타 요구사항으로 변환하는 도구 개발

## What is hwp?

한글(HWP)은 대한민국에서 널리 사용되는 워드 프로세서 파일 포맷입니다.  
공공기관, 기업 등에서 다양한 버전의 HWP 파일이 사용되고 있습니다.

### HWP Formats

1. **HWP (바이너리)**

   - 확장자: `.hwp`
   - 한글 프로그램의 기본 저장 포맷 (이진 파일)
   - 텍스트 에디터에서 읽을 수 없음
   - 구조가 일부만 공개되어 있음

2. **HWPML**

   - 확장자: `.hwpml`, `.xml` (또는 `.hwp`로 저장될 수도 있음)
   - 한글 문서를 XML 기반으로 변환한 포맷
   - 텍스트 에디터에서 바로 읽고 파싱 가능
   - 한글에서 "다른 이름으로 저장 > HWPML"로 변환 가능

3. **HWPX**
   - 확장자: `.hwpx`
   - 2010년 이후 등장한 XML 기반의 공식 표준 포맷 (KS X 6101)
   - 구조가 명확하고 범용 XML 파서로 쉽게 처리 가능

> 참고:
>
> - `.hwp` 파일은 바이너리 또는 HWPML(XML)일 수 있습니다.
> - HWPML, HWPX는 파싱 및 데이터 추출이 용이합니다.

## Developer note

### plans

HWPX를 XML 또는 HTML로 변환 가능하다는 전제 하에,
HWP > HWPX > XML > KT meta 구현 할 예정임

#### Tests

1. HWPX > XML
2. HWP > HWPX
3. HWPML > HTML

#### develop

1. HTML > KT meta
2. XML > KT meta

---

### 기타 참고

- 문의: allenlee-37@github.com
- 이메일: hxlee42@gmail.com
