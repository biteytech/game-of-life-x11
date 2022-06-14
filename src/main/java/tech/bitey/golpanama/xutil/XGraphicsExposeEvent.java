// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XGraphicsExposeEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("drawable"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("count"),
        Constants$root.C_INT$LAYOUT.withName("major_code"),
        Constants$root.C_INT$LAYOUT.withName("minor_code"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XGraphicsExposeEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XGraphicsExposeEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XGraphicsExposeEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XGraphicsExposeEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XGraphicsExposeEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XGraphicsExposeEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XGraphicsExposeEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XGraphicsExposeEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XGraphicsExposeEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XGraphicsExposeEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XGraphicsExposeEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XGraphicsExposeEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XGraphicsExposeEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle drawable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("drawable"));
    public static VarHandle drawable$VH() {
        return XGraphicsExposeEvent.drawable$VH;
    }
    public static long drawable$get(MemorySegment seg) {
        return (long)XGraphicsExposeEvent.drawable$VH.get(seg);
    }
    public static void drawable$set( MemorySegment seg, long x) {
        XGraphicsExposeEvent.drawable$VH.set(seg, x);
    }
    public static long drawable$get(MemorySegment seg, long index) {
        return (long)XGraphicsExposeEvent.drawable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void drawable$set(MemorySegment seg, long index, long x) {
        XGraphicsExposeEvent.drawable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XGraphicsExposeEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XGraphicsExposeEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XGraphicsExposeEvent.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XGraphicsExposeEvent.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("count"));
    public static VarHandle count$VH() {
        return XGraphicsExposeEvent.count$VH;
    }
    public static int count$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.count$VH.get(seg);
    }
    public static void count$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.count$VH.set(seg, x);
    }
    public static int count$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void count$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle major_code$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("major_code"));
    public static VarHandle major_code$VH() {
        return XGraphicsExposeEvent.major_code$VH;
    }
    public static int major_code$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.major_code$VH.get(seg);
    }
    public static void major_code$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.major_code$VH.set(seg, x);
    }
    public static int major_code$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.major_code$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void major_code$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.major_code$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle minor_code$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minor_code"));
    public static VarHandle minor_code$VH() {
        return XGraphicsExposeEvent.minor_code$VH;
    }
    public static int minor_code$get(MemorySegment seg) {
        return (int)XGraphicsExposeEvent.minor_code$VH.get(seg);
    }
    public static void minor_code$set( MemorySegment seg, int x) {
        XGraphicsExposeEvent.minor_code$VH.set(seg, x);
    }
    public static int minor_code$get(MemorySegment seg, long index) {
        return (int)XGraphicsExposeEvent.minor_code$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minor_code$set(MemorySegment seg, long index, int x) {
        XGraphicsExposeEvent.minor_code$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


